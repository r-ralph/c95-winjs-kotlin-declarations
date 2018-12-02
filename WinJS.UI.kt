@file:Suppress(
    "unused",
    "PackageName"
)
@file:JsQualifier("WinJS.UI")

package WinJS.UI

import org.w3c.dom.Element

external fun processAll(
    rootElement: Element? = definedExternally,
    skipRoot: Boolean? = definedExternally
): WinJS.Promise<Any> = definedExternally

external fun process(element: Element): WinJS.Promise<Any> = definedExternally
