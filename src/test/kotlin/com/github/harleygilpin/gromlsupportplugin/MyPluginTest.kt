package com.github.harleygilpin.gromlsupportplugin

import com.intellij.testFramework.fixtures.BasePlatformTestCase

class MyPluginTest : BasePlatformTestCase() {
    fun testPluginLoads() {
        assertNotNull("Project should not be null", project)
    }
}
