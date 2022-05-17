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
       Assertions.assertEquals("1 3 N",rover.getPosition());

    }

    @Test
    void should_return_5_1_as_position_and_E_as_orientation(){
        // given
        Rover rover = new Rover(3,3,'E');
        //when
        String command="MMRMMRMRRM";
        command.chars().forEach(value -> rover.runCommand((char) value));

        //then
        Assertions.assertEquals("5 1 E",rover.getPosition());

    }

    @Test
    void should_return_1_3_as_position_and_E_as_orientation_when_cmd_is_R(){
        // given
        Rover rover = new Rover(1,3,'N');
        //when
        rover.runCommand('R');

        //then
        Assertions.assertEquals("1 3 E",rover.getPosition());
    }

    @Test
    void should_return_1_3_as_position_and_S_as_orientation_when_cmd_is_R(){
        // given
        Rover rover = new Rover(1,3,'E');
        //when
        rover.runCommand('R');

        //then
        Assertions.assertEquals("1 3 S",rover.getPosition());
    }

    @Test
    void should_return_1_3_as_position_and_W_as_orientation_when_cmd_is_R(){
        // given
        Rover rover = new Rover(1,3,'S');
        //when
        rover.runCommand('R');

        //then
        Assertions.assertEquals("1 3 W",rover.getPosition());
    }

    @Test
    void should_return_1_3_as_position_and_N_as_orientation_when_cmd_is_R(){
        // given
        Rover rover = new Rover(1,3,'W');
        //when
        rover.runCommand('R');

        //then
        Assertions.assertEquals("1 3 N",rover.getPosition());
    }


    @Test
    void should_return_1_3_as_position_and_W_as_orientation_when_cmd_is_L(){
        // given
        Rover rover = new Rover(1,3,'N');
        //when
        rover.runCommand('L');

        //then
        Assertions.assertEquals("1 3 W",rover.getPosition());
    }

    @Test
    void should_return_1_3_as_position_and_S_as_orientation_when_cmd_is_L(){
        // given
        Rover rover = new Rover(1,3,'W');
        //when
        rover.runCommand('L');

        //then
        Assertions.assertEquals("1 3 S",rover.getPosition());
    }

    @Test
    void should_return_1_3_as_position_and_E_as_orientation_when_cmd_is_L(){
        // given
        Rover rover = new Rover(1,3,'S');
        //when
        rover.runCommand('L');

        //then
        Assertions.assertEquals("1 3 E",rover.getPosition());
    }

    @Test
    void should_return_1_3_as_position_and_N_as_orientation_when_cmd_is_L(){
        // given
        Rover rover = new Rover(1,3,'E');
        //when
        rover.runCommand('L');

        //then
        Assertions.assertEquals("1 3 N",rover.getPosition());
    }

    @Test
    void should_move_to_1_4_position(){
        // given
        Rover rover = new Rover(1,3,'N');
        //when
        rover.runCommand('M');

        //then
        Assertions.assertEquals("1 4 N",rover.getPosition());
    }

    @Test
    void should_deny_move_when_position_is_0_1_w(){
        // given
        Rover rover = new Rover(0,1,'W');
        //when
        rover.runCommand('M');

        //then
        Assertions.assertEquals("0 1 W",rover.getPosition());
    }
}
