package io.github.mikovali.gradle.android.signing

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Test

import static org.junit.Assert.assertTrue

class AndroidSigningConfigPluginTest {

    static final String PLUGIN_ID = 'io.github.mikovali.android.signing'

    @Test
    public void pluginIdRefersToCorrectClass() {
        Project project = ProjectBuilder.builder().build()
        project.pluginManager.apply(PLUGIN_ID)

        assertTrue(project.getPlugins().findPlugin(PLUGIN_ID) instanceof AndroidSigningConfigPlugin)
    }
}
