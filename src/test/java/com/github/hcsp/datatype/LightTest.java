package com.github.hcsp.datatype;

import com.github.blindpirate.extensions.CaptureSystemOutput;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public class LightTest {
    @Test
    @CaptureSystemOutput
    public void printNumbersCorrectly(CaptureSystemOutput.OutputCapture capture) {
        capture.expect(Matchers.containsString("状态未知的灯亮着吗：false"));
        capture.expect(Matchers.containsString("亮着的灯亮着吗：true"));
        capture.expect(Matchers.containsString("灭了的灯亮着吗：false"));
        Main.main(null);
    }
}
