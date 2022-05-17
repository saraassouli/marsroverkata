package org.arolla.kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RoverTest {

   @Test
   void should_return_1_3_as_position_and_N_as_orientation(){
        // given
       Rover rover = new Rover(1,2,'N');
       //when
       String command="LMLMLMLMM";
       command.chars().forEach(value -> rover.runCommand((char) value));

       //then
       Assertions.assertEquals(1,rover.getXCoordinate());
       Assertions.assertEquals(3,rover.getYCoordinate());
       Assertions.assertEquals('N',rover.getOrientation());

    }

    @Test
    void should_return_1_3_as_position_and_E_as_orientation_when_cmd_is_R(){
        // given
        Rover rover = new Rover(1,3,'N');
        //when
        rover.runCommand('R');

        //then
        Assertions.assertEquals(1,rover.getXCoordinate());
        Assertions.assertEquals(3,rover.getYCoordinate());
        Assertions.assertEquals('E',rover.getOrientation());

    }

    @Test
    void should_return_1_3_as_position_and_S_as_orientation_when_cmd_is_R(){
        // given
        Rover rover = new Rover(1,3,'E');
        //when
        rover.runCommand('R');

        //then
        Assertions.assertEquals(1,rover.getXCoordinate());
        Assertions.assertEquals(3,rover.getYCoordinate());
        Assertions.assertEquals('S',rover.getOrientation());

    }

    @Test
    void should_return_1_3_as_position_and_W_as_orientation_when_cmd_is_R(){
        // given
        Rover rover = new Rover(1,3,'S');
        //when
        rover.runCommand('R');

        //then
        Assertions.assertEquals(1,rover.getXCoordinate());
        Assertions.assertEquals(3,rover.getYCoordinate());
        Assertions.assertEquals('W',rover.getOrientation());

    }

    @Test
    void should_return_1_3_as_position_and_N_as_orientation_when_cmd_is_R(){
        // given
        Rover rover = new Rover(1,3,'W');
        //when
        rover.runCommand('R');

        //then
        Assertions.assertEquals(1,rover.getXCoordinate());
        Assertions.assertEquals(3,rover.getYCoordinate());
        Assertions.assertEquals('N',rover.getOrientation());

    }


    @Test
    void should_return_1_3_as_position_and_W_as_orientation_when_cmd_is_L(){
        // given
        Rover rover = new Rover(1,3,'N');
        //when
        rover.runCommand('L');

        //then
        Assertions.assertEquals(1,rover.getXCoordinate());
        Assertions.assertEquals(3,rover.getYCoordinate());
        Assertions.assertEquals('W',rover.getOrientation());

    }

    @Test
    void should_return_1_3_as_position_and_S_as_orientation_when_cmd_is_L(){
        // given
        Rover rover = new Rover(1,3,'W');
        //when
        rover.runCommand('L');

        //then
        Assertions.assertEquals(1,rover.getXCoordinate());
        Assertions.assertEquals(3,rover.getYCoordinate());
        Assertions.assertEquals('S',rover.getOrientation());

    }

    @Test
    void should_return_1_3_as_position_and_E_as_orientation_when_cmd_is_L(){
        // given
        Rover rover = new Rover(1,3,'S');
        //when
        rover.runCommand('L');

        //then
        Assertions.assertEquals(1,rover.getXCoordinate());
        Assertions.assertEquals(3,rover.getYCoordinate());
        Assertions.assertEquals('E',rover.getOrientation());

    }

    @Test
    void should_return_1_3_as_position_and_N_as_orientation_when_cmd_is_L(){
        // given
        Rover rover = new Rover(1,3,'E');
        //when
        rover.runCommand('L');

        //then
        Assertions.assertEquals(1,rover.getXCoordinate());
        Assertions.assertEquals(3,rover.getYCoordinate());
        Assertions.assertEquals('N',rover.getOrientation());

    }
}
