# 🧩 Groml Support Plugin

**Groml Support** is an IntelliJ plugin that brings first-class support for the [Groml configuration language—Greg’s Really Obvious Minimal Language](https://github.com/GregHib/void/tree/9709cc14e448617ec0cfe23b3921b7287950d221/config).


<!-- Plugin description -->
Adds syntax highlighting and parsing support for Groml configuration files (`.toml`), including sections, keys, values, arrays, and maps.
<!-- Plugin description end -->

Groml sits between a simplified TOML and an extended INI in terms of complexity. This plugin ensures `.toml` files written in Groml are parsed and highlighted accurately, avoiding false errors and enabling useful development features.

---

## ✨ Features

- 🎨 **Custom Syntax Highlighting**  
  Distinguishes sections, keys, values, arrays, maps, and comments using color-coded formatting.

- 🧠 **Accurate Parsing**  
  Recognizes Groml syntax and avoids TOML validation errors on valid Groml files.

- 🧬 **Section Inheritance Support**  
  Supports Groml’s inheritance model with the `.` prefix (e.g., `[.child]` expands parent sections).

- 🪓 **Groml-Specific Validation**  
  Detects syntax errors such as disallowed multiline strings or unsupported types.

- 🧭 **Code Navigation**  
  Navigate easily between sections and key-value pairs within the file.

---

## 📁 File Extension

- `.toml` — Groml uses the `.toml` extension for compatibility. This plugin distinguishes Groml from standard TOML for proper handling.

---

## 📦 Installation

### Via IntelliJ Marketplace

1. Open **Settings > Plugins**
2. Click the **Marketplace** tab
3. Search for **Groml Support**
4. Click **Install** and restart the IDE

### Manual Installation

1. Download the latest `.zip` from the [Releases](https://github.com/your-org/groml-intellij-plugin/releases)
2. Open **Settings > Plugins**
3. Click the ⚙️ gear icon > **Install Plugin from Disk**
4. Select the `.zip` file and restart the IDE

---

## ⚙️ Configuration

No configuration is needed. The plugin automatically detects `.toml` files and applies Groml highlighting. If needed, adjust file type associations in:
