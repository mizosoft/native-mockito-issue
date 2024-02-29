package com.github.mizosoft.pg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MockitoTest {
  @Test
  void test() {
    var mock = Mockito.mock(ProcessHandle.class);
    when(mock.pid()).thenReturn(1L);
    assertEquals(1L, mock.pid());
  }
}
