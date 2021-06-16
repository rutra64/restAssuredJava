package constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum OctocatValues {
    NAME("The Octocat"),
    LOCATION("San Francisco");
    String value;
}
