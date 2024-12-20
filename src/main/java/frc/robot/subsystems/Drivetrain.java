// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {
  /** Creates a new Drivetrain. */
  CANSparkMax right_1;
  CANSparkMax right_2;
  CANSparkMax left_1;
  CANSparkMax left_2;
  double rx;
  double ly;
  public Drivetrain() {
  right_1 = new CANSparkMax(Constants.dt.r1, MotorType.kBrushless);
  right_2 = new CANSparkMax(Constants.dt.r2, MotorType.kBrushless);
  left_1 = new CANSparkMax(Constants.dt.l1, MotorType.kBrushless);
  left_2 = new CANSparkMax(Constants.dt.l2, MotorType.kBrushless);

  right_1.setIdleMode(IdleMode.kBrake);
  right_2.setIdleMode(IdleMode.kBrake);
  left_1.setIdleMode(IdleMode.kBrake);
  left_2.setIdleMode(IdleMode.kBrake);

  right_2.follow(right_1);
  left_2.follow(left_1);
  }

  public void arcade (Joystick r_joystick,Joystick l_joystick){
    rx = r_joystick.getX();
    ly = l_joystick.getY();
    right_1.set(ly-rx);
    left_1.set(ly+rx);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
