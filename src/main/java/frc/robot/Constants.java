// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
   public static final class SUBSYSTEM{
      public static final int RIGHTMOTOR1_ID = 11;
      public static final int RIGHTMOTOR2_ID = 7;
      public static final int LEFTMOTOR1_ID = 8;
      public static final int LEFTMOTOR2_ID = 4;
      public static final int SUCKER_ID = 5;
      public static final int OPENER_ID = 6;
      public static final int GRABBER_ID = 10;
   }
   public static final class JOYSTICK{
      public static final int X = 3;
      public static final int Y = 2;
      public static final int L1 = 1;
      public static final int L2 = 0;
      public static final int G = 11;
   }
   public static final class PID {
      public static final double kP = 0;
      public static final double kI = 0;
      public static final double kD = 0;

      public static final double kToleranceDegrees = 2.0;
      public static final double kToleranceAngularVelocity = 0.08;
      
   }
    public static final class SPEED {
      public static final double GRAB_SPEED = 1;
    }  
    public static final double GRAB_TIME = SPEED.GRAB_SPEED*((5.330)/60/2/2);
   }
    

