package com.github.harleygilpin.gromlsupportplugin

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class GromlFileType : LanguageFileType(GromlLanguage) {
    override fun getName() = "Groml"

    override fun getDescription() = "Groml configuration file"

    override fun getDefaultExtension() = "toml"

    override fun getIcon(): Icon = GromlIcons.FILE
}
