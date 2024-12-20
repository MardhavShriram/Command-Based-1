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
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }

  //DriveTrain CAN IDs
  public static class dt {
  public static final int r1 = 0;
  public static final int r2 = 1;
  public static final int l1 = 2;
  public static final int l2 = 3;
  }

  //Pivot CAN IDs
  public static class pivot_id {
    public static final int pl = 4;
    public static final int pr = 5;
  }

  //Pivot speed
  public static class pivot_speed {
    public static final double ps = .5;
  }
}
