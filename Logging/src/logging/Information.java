package logging;

import java.util.Date;

public class Information extends Logger
{
	Long timeStep;
	String level;
	String message;
	String simulationObject;

	public Information(Long timeStep, String level, String message, String simulationObject)
	{
		super(new Date(), level, timeStep, message, simulationObject);

	}

}
