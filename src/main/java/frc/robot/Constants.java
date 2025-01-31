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


  public final class Drive_Ids {
    public static final int right_M1_ID = 0; //Dirvetrain motor ID's
    public static final int right_M2_ID = 1;
    public static final int right_M3_ID = 2;
    public static final int right_M4_ID = 3;
    
    
    public static final int left_M1_ID = 4;
    public static final int left_M2_ID = 5;
    public static final int left_M3_ID = 6;
    public static final int left_M4_ID = 7;
  }


  public final class Intake{
        public static final int right_intake_ID = 1; //Intake Motor ID's
        public static final int left_intake_ID = 2;

        public static final double out_intake_speed = -0.5;
        public static final double in_intake_speed = 0.5;

  }
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }
}
