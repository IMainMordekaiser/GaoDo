// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import frc.robot.RobotContainer;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import static frc.robot.Constants.SUBSYSTEM.*;
import static frc.robot.Constants.JOYSTICK.*;

public class DriveBase extends SubsystemBase {
  /** Creates a new DriveBase. */
  
  public WPI_TalonSRX rightMaster = new WPI_TalonSRX(RIGHTMOTOR1_ID);
  public WPI_TalonSRX leftMaster = new WPI_TalonSRX(LEFTMOTOR1_ID);
  public  WPI_TalonSRX rightFollow = new WPI_TalonSRX(RIGHTMOTOR2_ID);
  public  WPI_TalonSRX leftFollow = new WPI_TalonSRX(LEFTMOTOR2_ID);
   public DriveBase(){
     rightFollow.follow(rightMaster);
     leftFollow.follow(leftMaster);
     leftMaster.setInverted(true);
    
   }
  public void drive(double leftdrive, double rightdrive){
        leftMaster.set(leftdrive);
        rightMaster.set(rightdrive);

  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    double boost = RobotContainer.taycam.getRawButton(X)? 0.8 : 0.4;
    drive(RobotContainer.taycam.getRawAxis(L1)*boost,RobotContainer.taycam.getRawAxis(L2)*boost);
  }
}
