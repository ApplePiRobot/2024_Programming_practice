package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class Controls extends SubsystemBase{
    private static Controls instance = null;

    private static final int CONTROLLER_PORT = 0;
    private final CommandXboxController m_Controller;

    public static Controls getInstance(){
        if (instance == null) {
            instance = new Controls();
        }
        return instance();
    }
}
