package org.arolla.kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RoverTest {

   @Test
   void should_return_1_3_as_position_and_N_as_orientation(){
        // given
       Rover rover = new Rover(1,2,'N');
       //when
       rover.runCommand("LMLMLMLMM");

       //then
       Assertions.assertEquals(1,rover.getXCoordinate());
       Assertions.assertEquals(3,rover.getYCoordinate());
       Assertions.assertEquals('N',rover.getOrientation());

    }
}
