// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import static frc.robot.Constants.PID.*;

public class TurnController extends SubsystemBase {
  /** Creates a new TurnController. */
  private PIDController turnController;

  public TurnController() {
    turnController = new PIDController(kP, kI, kD);
  }

  private static TurnController tcontroller = null;
  private static TurnController getInstance() {
    if (tcontroller == null) {
      tcontroller = new TurnController();
    }
    return tcontroller;
  }

  public void setSetPoint(double x) {
    turnController.setSetpoint(x); 
    // set setPoint for PID controller
  }

  public void reset() {
    turnController.reset();
  }

  public void enableContinuousInput(double a, double b) {
    turnController.enableContinuousInput(a, b);
    // Thay vì sử dụng phạm vi đầu vào tối đa và tối thiểu làm các ràng buộc,
   // nó coi chúng là cùng một điểm và tự động tính toán tuyến đường ngắn nhất
  // đến điểm đặt.
  }

  public void setIntegratorRange(double m, double n) {
    turnController.setIntegratorRange(m, n);
//     Đặt giá trị nhỏ nhất và lớn nhất cho bộ tích hợp.
// Khi đạt đến giới hạn, giá trị bộ tích phân được thêm vào đầu ra của
// bộ điều khiển thay vì giá trị bộ tích phân nhân với độ lợi tích phân.
  }

  public void setTolerance() {
    turnController.setTolerance(kToleranceDegrees, kToleranceAngularVelocity);
// Đặt lỗi được coi là có thể chấp nhận được để sử dụng tại Setpoint ().
  }

  public double calculate(double c) {
    return turnController.calculate(c);
// Trả về đầu ra tiếp theo của bộ điều khiển PID.
  }

  public boolean atSetpoint() {
    return turnController.atSetpoint();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
