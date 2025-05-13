package com.github.harleygilpin.gromlsupportplugin

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.psi.FileViewProvider

class GromlFile(
    viewProvider: FileViewProvider,
) : PsiFileBase(viewProvider, GromlLanguage) {
    override fun getFileType() = GromlFileType

    override fun toString(): String = "Groml"
}
