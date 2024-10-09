package frc.robot.subsystems;

import com.ctre.phoenix6.controls.DutyCycleOut;
import com.ctre.phoenix6.hardware.TalonFX;

public class Falcon {
    private static Falcon instance = null;    
    private static double FALCON_500_MAX_SPEED_RPS = 6380/1;

    private final TalonFX m_motor;

    private Falcon() {
        m_motor = new TalonFX(1);
    }

    public void setPercentOutput(double percentOutput){
        m_motor.setControl(new DutyCycleOut(percentOutput));
    }

    public void setTargetVelocityRPM(double rpm){
        double rps = rpm/60;
    }

    public static Falcon getInstance(){
        if (instance == null) {
            instance = new Falcon();
        }
        return instance;
    }
}
