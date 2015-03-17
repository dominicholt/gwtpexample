package com.example.gwtp.client;

import com.google.gwt.junit.client.GWTTestCase;

public class SandboxGwtTest extends GWTTestCase {
    @Override
    public String getModuleName() {
        return "com.projectname.project.DominicHolt";
    }

    public void testSandbox() {
        assertTrue(true);
    }
}
