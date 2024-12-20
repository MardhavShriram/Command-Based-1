// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants;
import frc.robot.subsystems.Pivot;

public class PivotUp extends Command {
  /** Creates a new PivotUp. */
  Pivot pt;
  JoystickButton ptu;
  public PivotUp(Pivot pt) {
    // Use addRequirements() here to declare subsystem dependencies.\
    this.pt = pt;
    addRequirements(this.pt);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    this.pt.pivot_move(Constants.pivot_speed.ps);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    this.pt.pivot_move(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
