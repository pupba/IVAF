package IVAF_JAVA_정광원_Week2;

interface Head{
	final String EYE_STATUS = "정상";
	final String HEAD_LOCATION = "정면";
	abstract public void see(String object);
	abstract public void spinHead();
}
interface Arms{
	final String ARMS_STATUS = "정상";
	final String FINGER_STATUS = "정상";
	abstract public void  armUp();
	abstract public void  armDown();	
}
interface Body{
	final String BODY_STATUS = "정상";
	final String BMI = "정상";
	abstract public void spinBody();
	abstract public void hugry();
}
interface Legs{
	final String LEG_STATUS = "정상"; 
	final String TOES_STATUS = "정상";
	abstract public void legUp();
	abstract public void legDown();
}
