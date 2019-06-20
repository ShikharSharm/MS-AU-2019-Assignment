package au2019.assignments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

class StudentScoreTest {
	@Mock
	public StudentData mockDatabase; 

	public StudentScore studentScores; 

	@BeforeEach
	public void beforeEach()
	{
	MockitoAnnotations.initMocks(this);
	} 

	@Test
	public void calculateSumAndStore_withValidInput_shouldCalculateAndUpdateResultInDb()
	{
	studentScores = new StudentScore(mockDatabase);
	int[] scores = {60,70,90};
	Mockito.doNothing().when(mockDatabase).updateScores("student1", 230); 

	// Act
	studentScores.calculateSumAndStore("student1", scores); 

	// Assert
	Mockito.verify(mockDatabase, Mockito.times(1)).updateScores("student1", 230);
	} 

}
