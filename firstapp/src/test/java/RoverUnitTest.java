import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class RoverUnitTest {
    @Test
    public void ShouldStartAtZeroZeroHeadingToNorth(){
        Rover rover = new Rover();
        String actualPosition = rover.ExecuteCommands("");

        assertThat(actualPosition).isEqualTo("0:0:N");
    }

    @Test
    public void MoveRight_ShouldBeAtZeroZeroHeadingToEast(){
        Rover rover = new Rover();
        String actualPosition = rover.ExecuteCommands("R");

        assertThat(actualPosition).isEqualTo("0:0:E");
    }
}
