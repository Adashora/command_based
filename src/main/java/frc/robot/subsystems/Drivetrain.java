// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;

import frc.robot.Constants;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
  /** Creates a new ExampleSubsystem. */
  SparkMax r_motor_1;
  SparkMax r_motor_2;
  SparkMax r_motor_3;
  SparkMax r_motor_4;

  SparkMax l_motor_1;
  SparkMax l_motor_2;
  SparkMax l_motor_3;
  SparkMax l_motor_4;

  
  SparkMaxConfig right_config;
  SparkMaxConfig left_config;

  double x; //driving variables
  double y;

  public Drivetrain() {


    r_motor_1 = new SparkMax(Constants.right_M1_ID, MotorType.kBrushless); //defining all right motors
    r_motor_2 = new SparkMax(Constants.right_M2_ID, MotorType.kBrushless);
    r_motor_3 = new SparkMax(Constants.right_M3_ID, MotorType.kBrushless);
    r_motor_4 = new SparkMax(Constants.right_M4_ID, MotorType.kBrushless);

    l_motor_1 = new SparkMax(Constants.right_M4_ID, MotorType.kBrushless); //defining all left motors
    l_motor_2 = new SparkMax(Constants.right_M4_ID, MotorType.kBrushless);
    l_motor_3 = new SparkMax(Constants.right_M4_ID, MotorType.kBrushless);
    l_motor_4 = new SparkMax(Constants.right_M4_ID, MotorType.kBrushless);

    right_config = new SparkMaxConfig(); //define the configs
    left_config = new SparkMaxConfig();

    right_config //set configs
      .inverted(false)
      .idleMode(IdleMode.kBrake);
    
    left_config //set configs
      .inverted(false)
      .idleMode(IdleMode.kBrake);
    
    
      r_motor_1.configure(right_config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
      r_motor_2.configure(right_config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
      r_motor_3.configure(right_config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
      r_motor_4.configure(right_config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);

      l_motor_1.configure(left_config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
      l_motor_2.configure(left_config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
      l_motor_3.configure(right_config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
      l_motor_4.configure(right_config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);



    //back right motor follow front right motor
    right_config.follow(r_motor_1);
        //make back left follow front left motor
    left_config.follow(l_motor_1);
    


  }

  public void arcade(Joystick l_joystick, Joystick r_joystick){
    x = r_joystick.getX();
    y = -l_joystick.getY();

    r_motor_1.set(y-x);
    l_motor_1.set(y+x);
  }
  

  /**
   * Example command factory method.
   *
   * @return a command
   */
  public Command exampleMethodCommand() {
    // Inline construction of command goes here.
    // Subsystem::RunOnce implicitly requires `this` subsystem.
    return runOnce(
        () -> {
          /* one-time action goes here */
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
