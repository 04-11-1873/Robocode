package coelho;
import robocode.*;
import java.awt.Color;

/**
 * Outro - a class by (Barbarah Evelyn)
 */

public class Outro extends Robot {
    private String inimigo;

    public void run() {
        while (true) {
            if (inimigo != null) {
                double angulo = getHeading() + getBearingToEnemy();
                turnRight(angulo);
                ahead(100);
            }
			else {
                turnRadarRight(360);
            }
        }
    }
       
public void onScannedRobot(ScannedRobotEvent event) {
        inimigo = event.getName();
    }
private double getBearingToEnemy() {    
	ScannedRobotEvent enemy = getScannedRobotEvents()[0];
        return enemy.getBearing();
    }
	public void onHitWall(HitWallEvent e) {
		back(55);
		turnRight(90);
	}
}
