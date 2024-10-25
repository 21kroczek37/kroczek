CoordMode("Mouse", "Screen")
CoordMode("Pixel", "Screen")
screenWidth := A_ScreenWidth
screenHeight := A_ScreenHeight
middleY := screenHeight / 2
direction := "right"
sleepTime := 10
Loop {
MouseGetPos(&x, &y)
color := PixelGetColor(x, y, "RGB")
red := (color >> 16) & 0xFF
green := (color >> 8) & 0xFF
blue := color & 0xFF
if (blue > 128 && red < 64 && green < 64) {  ; Odcienie niebieskiego
direction := "down"
} else if (green > 128 && red < 64 && blue < 64) {  ; Odcienie zielonego
direction := "right"
} else if (red > 128 && green < 64 && blue < 64) {  ; Odcienie czerwonego
direction := "up"
}
if (direction == "right") {
x += 1
} else if (direction == "down") {
y += 1
} else if (direction == "up") {
y -= 1
}
MouseMove(x, y)
if (x >= screenWidth) {
break
}
Sleep(sleepTime)
}
MsgBox "przeszedłoś labirynt."
Run "mspaint.exe"
if !WinWaitActive("ahk_class MSPaintApp",, 2)
    return

MouseClickDrag "L", 150, 450, 150, 350
MouseClickDrag "L", 150, 350, 200, 300
MouseClickDrag "L", 200, 300, 250, 350
MouseClickDrag "L", 250, 350, 150, 350
MouseClickDrag "L", 150, 350, 250, 450
MouseClickDrag "L", 250, 450, 250, 350
MouseClickDrag "L", 250, 350, 150, 450
MouseClickDrag "L", 150, 450, 250, 450 

KeyWait "LButton" 
MouseClickDrag "L", 350, 450, 350, 350
MouseClickDrag "L", 380, 380, 380, 400
MouseClickDrag "L", 350, 380, 300, 400
MouseClickDrag "L", 350, 450, 450, 450 
MouseClickDrag "L", 315, 420, 420, 420 
MouseClickDrag "L", 350, 350, 450, 350
KeyWait "LButton", "D T1"
Run("notepad.exe")
if WinWaitActive("ahk_class Notepad", "", 2)

    Send "mati daj mi 6 z praktyk"

Run "chrome.exe"
if WinWaitActive("ahk_class Chrome", "", 2)
WinWait
Send "usa time {enter}"
Sleep 1500
MouseMove 100, 320
MouseClick "left",,, 3
Sleep 500
Send "^c"
Sleep 500
MouseClick "left", 336, 750
Sleep 500
;;Czas w USA
Send "{enter} czas w usa jest : ^v"
Sleep 500
varClip1 := A_Clipboard
Send A_Clipboard
Run "chrome.exe"
if WinWaitActive("ahk_class Chrome", "", 2)
Sleep 1500
Send "mołdawia time {enter}"
Sleep 1500
MouseMove 100, 390
MouseClick "left",,, 3
Sleep 500
Send "^c"
varClip2 := A_Clipboard
Send varClip2

Sleep 500
MouseClick "left", 336, 750
Sleep 500
Send "{enter} czas w Mołdawi jest jest : ^v"
Sleep 500
Sleep 1500
Send varClip1
Send varClip2
#Requires AutoHotkey v2.0