package Endpoints;

import io.restassured.response.Response;
import org.testng.Assert;

import java.lang.reflect.Type;

@SuppressWarnings("unchecked")
public abstract class BaseEndpoint<E, M> {
    protected Response response;
    protected  abstract Type getModelType();
    public abstract E sendRequest();
    protected abstract int getSuccessStatusCode();

    public M getResponseModel() {
        assertThatResponseIsNotNull();
        return response.as(getModelType());
    }

    public E assertRequestSuccess() {
        return assertStatusCode(getSuccessStatusCode());
    }

    public E assertStatusCode(int statusCode) {
        assertThatResponseIsNotNull();
        Assert.assertEquals(response.getStatusCode(), statusCode);
        return (E) this;
    }

    protected void assertThatResponseIsNotNull() {
        Assert.assertNotNull(response);
    }
}
