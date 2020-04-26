# Learn Kotlin

*Documents:* https://kotlinlang.org/docs/tutorials/

## IDE:
### 1. [JetBrain](https://www.jetbrains.com/idea/download/#section=windows)
### 2. [Visual Studio Code](https://code.visualstudio.com/)

## Setup Enviroment (on Windows):
### 1. [Download JDK](https://github.com/huubao2309/learn_kotlin#1-download-and-setup-jdk)
### 2. [Download Chocolatey](https://github.com/huubao2309/learn_kotlin#2-download-chocolatey-1)
### 3. [Download Kotlin Compiler](https://github.com/huubao2309/learn_kotlin#3-download-kotlin-compiler-1)
### 4. [Setup "Code Runner" Extension on VS Code](https://github.com/huubao2309/learn_kotlin#4-setup-code-runner-extension-on-visual-studio-code)
### 5. [Setup run Kotlin Project](https://github.com/huubao2309/learn_kotlin#5-setup-run-kotlin-project-1)


## Example:
### 1. [Hello Kotlin](https://github.com/huubao2309/demo_control_flutter#1-container-1)
### 2. [Declare Variables](https://github.com/huubao2309/demo_control_flutter#2-text-1)
### 3. [Loops and Ranges](https://github.com/huubao2309/demo_control_flutter#3-row-1)


==============================================================================

## Setup Enviroment (on Windows):


### 1. Download and setup JDK:

![Download_JDK](https://github.com/huubao2309/learn_kotlin/blob/master/image/download_jdk.png)


### 2. Download Chocolatey:

▲ **Link**:https://chocolatey.org/install

- Run **PowerShell** with **"Run as administrator"** and setup **Chocolatey**:

![Setup_Choco](https://github.com/huubao2309/learn_kotlin/blob/master/image/setup_chocolatey.png)


### 3. Download Kotlin Compiler:

■  Search package **"Kotlin Compiler"**:

![Setup_Kotlin](https://github.com/huubao2309/learn_kotlin/blob/master/image/search_kotlin.png)

■  Download package **"Kotlin Compiler"**:

* **B1**:

![Download_Kotlin](https://github.com/huubao2309/learn_kotlin/blob/master/image/click_kotlin_compiler.png)

* **B2**:

![Download_Kotlin_2](https://github.com/huubao2309/learn_kotlin/blob/master/image/click_kotlin_compiler_2.png)

* **B3**:

![Download_Kotlin_3](https://github.com/huubao2309/learn_kotlin/blob/master/image/install_success_kotlin.png)


### 4. Setup **"Code Runner"** Extension on Visual Studio Code:

■ **B1**. Download **"Code Runner"** Extension on Visual Studio Code:

![Download_Kotlin_2](https://github.com/huubao2309/learn_kotlin/blob/master/image/download_coderunner.png)


■ **B2**. Change Setting Json **"Code Runner"** Extension on Visual Studio Code:

```dart
    Menu -> File -> Preferences -> Settings -> Search **executorMapByFileExtension** -> Change File JSon
```

(**Note**: View issue at https://github.com/formulahendry/vscode-code-runner/issues/125)

![Download_Kotlin_2](https://github.com/huubao2309/learn_kotlin/blob/master/image/download_codeRunner_settingJson.png)

### 5. Setup run **Kotlin Project**:

■ **B1**. Download **Kotlin** version release:

▲ **Link**: https://github.com/JetBrains/kotlin/releases?after=build-1.4.0-dev-6008

▲ **Dowload Kotlin Compiler version release**: 

![Download_Kotlin_compiler](https://github.com/huubao2309/learn_kotlin/blob/master/image/download_kotlin_compiler.png)

■ **B2**. Create folder **kotlinc** and copy file:

**Copy File**:

![Paste_Kotlin_compiler](https://github.com/huubao2309/learn_kotlin/blob/master/image/copy_file.png)

**Paste File**:

![Paste_Kotlin_compiler](https://github.com/huubao2309/learn_kotlin/blob/master/image/paste_file.png)

■ **B3**. Change **Path** for **kotlinc**:

```dart
    Control Panel -> Advances System Settings -> Enviroment Variables -> ...
```

![Chnage_path](https://github.com/huubao2309/learn_kotlin/blob/master/image/change_paht_1.png)

![Chnage_path](https://github.com/huubao2309/learn_kotlin/blob/master/image/change_paht_2.png)


■ **B4**. Run Project **"Hello Kotlin"**:

![Run_project_1](https://github.com/huubao2309/learn_kotlin/blob/master/image/hello_kotlin_1.png)

![Run_project_2](https://github.com/huubao2309/learn_kotlin/blob/master/image/hello_kotlin_2.png)

(**Reference**: https://www.youtube.com/watch?v=QeVl8fXteI0)


## Example:


### 1. [Hello Kotlin:](https://github.com/huubao2309/learn_kotlin/tree/master/src/Hello_Word)

```kotlin
	fun main() {
		println("Hello Kotlin")
	}
```

### 2. Declare Variables:
