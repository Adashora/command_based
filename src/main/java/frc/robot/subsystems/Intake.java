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

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Intake extends SubsystemBase {

  SparkMax Intake_right; //creating motors
  SparkMax Intake_left;


  SparkMaxConfig right_intake_config; //making configs
  SparkMaxConfig left_intake_config;

  /** Creates a new Intake. */

  public Intake() {

    Intake_left = new SparkMax(Constants.Intake.left_intake_ID, MotorType.kBrushless); //deifning motors
    Intake_right = new SparkMax(Constants.Intake.right_intake_ID, MotorType.kBrushless);

    right_intake_config = new SparkMaxConfig();
    left_intake_config = new SparkMaxConfig();

    right_intake_config
      .inverted(false)
      .idleMode(IdleMode.kBrake);

    left_intake_config
      .inverted(false)
      .idleMode(IdleMode.kBrake);

    Intake_left.configure(left_intake_config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    Intake_right.configure(right_intake_config, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    
  }

  public void intake_go (double Intake_speed) {

    Intake_left.set(Intake_speed);
    Intake_right.set(Intake_speed);

  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
