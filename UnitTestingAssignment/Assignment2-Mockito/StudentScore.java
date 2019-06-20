package au2019.assignments;

public class StudentScore {
	public StudentData databaseImpl;

	public StudentScore(StudentData databaseImpl)
	{
	this.databaseImpl = databaseImpl;
	} 

	public void calculateSumAndStore(String studentId, int[] scores)
	{
	int total = 0;
	for(int score : scores)
	{
	total = total + score;
	}
	
	databaseImpl.updateScores(studentId, total);
	}
}

 

