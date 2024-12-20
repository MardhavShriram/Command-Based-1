// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants;

public class Pivot extends SubsystemBase {
  /** Creates a new Pivot. */

  CANSparkMax pivot_left;
  CANSparkMax pivot_right;

  public Pivot() {

    pivot_left = new CANSparkMax(Constants.pivot_id.pl, MotorType.kBrushless);
    pivot_right = new CANSparkMax(Constants.pivot_id.pr, MotorType.kBrushless);

    pivot_left.setIdleMode(IdleMode.kBrake);
    pivot_right.setIdleMode(IdleMode.kBrake);
  }
  public void pivot_move(double speed){
    pivot_left.set(speed);
    pivot_right.set(speed);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
