package com.github.harleygilpin.gromlsupportplugin

import com.intellij.psi.PsiManager
import com.intellij.testFramework.fixtures.BasePlatformTestCase

class FileTypeTest : BasePlatformTestCase() {
    override fun getTestDataPath(): String = "src/test/testData"

    fun testGromlFileTypeIsRecognized() {
        val fileTypeManager =
            com.intellij.openapi.fileTypes.FileTypeManager
                .getInstance()
        println(">> Registered file types:")
        fileTypeManager.registeredFileTypes.forEach {
            println("  - ${it.name}: ${it::class.qualifiedName}")
        }
        val virtualFile = myFixture.copyFileToProject("sample.groml")
        val fileType = virtualFile.fileType

        println("Detected file type: ${fileType.name} (${fileType::class.qualifiedName})")
        assertEquals("Groml", fileType.name)

        val psiFile = PsiManager.getInstance(project).findFile(virtualFile)
        println("Detected PSI language: ${psiFile?.language?.id}")
        assertEquals("Groml", psiFile?.language?.id)
    }
}
