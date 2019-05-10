package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class GT4500Test {

  private DataAccess mockDA;
  private GT4500 ship;

  @BeforeEach
  public void init(){
    mockDA = mock(DataAccess.class);
    ship = new GT4500(mockDA);
  }

  @Test
  public void fireTorpedo_Single_Success(){
    // Arrange
    when(mockDA.fireTorpedo(FiringMode.SINGLE)).thenReturn(50);
    // Act
    ship.fireTorpedo(FiringMode.SINGLE);

    // Assert
    verify(mockDA, times(1)).fireTorpedo(FiringMode.SINGLE);
  }

  @Test
  public void fireTorpedo_All_Success(){
    // Arrange
    when(mockDA.fireTorpedo(FiringMode.ALL)).thenReturn(50);
    // Act
    ship.fireTorpedo(FiringMode.ALL);

    // Assert
    verify(mockDA, times(1)).fireTorpedo(FiringMode.ALL);
  }

}
