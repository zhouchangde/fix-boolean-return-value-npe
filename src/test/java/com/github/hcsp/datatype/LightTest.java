package com.github.hcsp.datatype;

import static org.hamcrest.Matchers.containsString;

import com.github.blindpirate.extensions.CaptureSystemOutput;
import org.junit.jupiter.api.Test;

public class LightTest {
    @Test
    @CaptureSystemOutput
    public void printNumbersCorrectly(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(containsString("状态未知的灯亮着吗：false"));
        capture.expect(containsString("亮着的灯亮着吗：true"));
        capture.expect(containsString("灭了的灯亮着吗：false"));
        Main.main(null);
    }
}
