package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.subElevator;

public class cmdAuto_MoveElevatorToPosition extends Command {
  subElevator elevator;
  Double target;
  public cmdAuto_MoveElevatorToPosition(subElevator elevator, Double target) {
    this.elevator = elevator;
    this.target = target;
    addRequirements(elevator);
  }

  @Override
  public void initialize() {
    elevator.setPIDTarget(target);
  }

  @Override
  public void execute() {
    elevator.moveToPIDTarget();
  }

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}
