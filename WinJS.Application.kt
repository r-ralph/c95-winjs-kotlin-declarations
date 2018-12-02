@file:Suppress(
    "unused",
    "PackageName"
)
@file:JsQualifier("WinJS.Application")

package WinJS.Application

external var sessionState: Any = definedExternally
external fun addEventListener(
    type: String,
    listener: Function<*>,
    capture: Boolean?
): Unit = definedExternally

external fun checkpoint(): Unit = definedExternally
external fun queueEvent(eventRecord: Any): Unit = definedExternally
external fun removeEventListener(
    type: String,
    listener: Function<*>,
    useCapture: Any?
): Unit = definedExternally

external fun start(): Unit = definedExternally
external fun stop(): Unit = definedExternally

external var onactivated: (dynamic) -> Unit
external var oncheckpoint: (dynamic) -> Unit
external var onerror: (dynamic) -> Unit
external var onloaded: (dynamic) -> Unit
external var onready: (dynamic) -> Unit
external var onsettings: (dynamic) -> Unit
external var onunload: (dynamic) -> Unit
external var onbackclick: (dynamic) -> Unit
