package coelho;
import robocode.*;
import java.awt.Color;

/**
 * Kyofuunocts - a class by (Barbarah Evelyn)
 */
public class Kyofuunocts extends AdvancedRobot {
	public void run() {
		setBodyColor(Color.white);
		setGunColor (Color.blue); 
		setRadarColor(Color.cyan);
		setScanColor(Color.red);
		setBulletColor(Color.white);
		while (true){
				ahead(100);
				turnRight(90);
				turnGunLeft(360);
		}
	}
	public void onScannedRobot (ScannedRobotEvent e){
		String robotank = e.getName();
		double distancia = e.getDistance();
		setTurnRadarRightRadians ( 20 ) ;
		setTurnRight(e.getBearing( ) + 90 );
		System.out.println(robotank + " distancia " + distancia);
		if (distancia < 135) {
			fire(3);
		} else {
			fire(1);
		}
	}
	public void onHitWall(HitWallEvent e) {
		back(55);
		turnRight(90);
	}
}
