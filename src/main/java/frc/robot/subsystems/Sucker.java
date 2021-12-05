// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import static frc.robot.Constants.SUBSYSTEM.*;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Sucker extends SubsystemBase {
  public WPI_TalonSRX sucker = new WPI_TalonSRX(SUCKER_ID);
  /** Creates a new Sucker. */
  public Sucker() {}
  public void suck(double speed){
    sucker.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
