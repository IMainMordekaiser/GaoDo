// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import static frc.robot.Constants.SUBSYSTEM.*;
import static frc.robot.Constants.SPEED.*;

public class Grabber extends SubsystemBase {
  /** Creates a new Grabber. */
  public WPI_TalonSRX Grabber = new WPI_TalonSRX(GRABBER_ID);

  public Grabber() {}
  public void grab(double speedu){
    speedu = GRAB_SPEED;
    Grabber.set(speedu);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
