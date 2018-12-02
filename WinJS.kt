@file:Suppress(
    "unused",
    "PackageName"
)
@file:JsQualifier("WinJS")

package WinJS

import org.w3c.dom.CustomEvent
import org.w3c.xhr.XMLHttpRequest

external var validation: Boolean = definedExternally

open external class ErrorFromName(name: String, message: String? = definedExternally) {
    companion object {
        var supportedForProcessing: Boolean = definedExternally
    }
}

external interface IPromise<T> {
    fun cancel()
    fun <U> done(
        onComplete: ((value: T) -> Any)? = definedExternally,
        onError: ((error: Any) -> Any)? = definedExternally,
        onProgress: ((progress: Any) -> Unit)? = definedExternally
    )

    fun <U> then(
        onComplete: ((value: T) -> IPromise<U>)? = definedExternally,
        onError: ((error: Any) -> IPromise<U>)? = definedExternally,
        onProgress: ((progress: Any) -> Unit)? = definedExternally
    ): IPromise<U>

    fun <U> then(
        onComplete: ((value: T) -> IPromise<U>)? = definedExternally,
        onError: ((error: Any) -> U)? = definedExternally,
        onProgress: ((progress: Any) -> Unit)? = definedExternally
    ): IPromise<U>

    fun <U> then(
        onComplete: ((value: T) -> IPromise<U>)? = definedExternally,
        onError: ((error: Any) -> Unit)? = definedExternally,
        onProgress: ((progress: Any) -> Unit)? = definedExternally
    ): IPromise<U>

    fun <U> then(
        onComplete: ((value: T) -> U)? = definedExternally,
        onError: ((error: Any) -> IPromise<U>)? = definedExternally,
        onProgress: ((progress: Any) -> Unit)? = definedExternally
    ): IPromise<U>

    fun <U> then(
        onComplete: ((value: T) -> U)? = definedExternally,
        onError: ((error: Any) -> U)? = definedExternally,
        onProgress: ((progress: Any) -> Unit)? = definedExternally
    ): IPromise<U>

    fun <U> then(
        onComplete: ((value: T) -> U)? = definedExternally,
        onError: ((error: Any) -> Unit)? = definedExternally,
        onProgress: ((progress: Any) -> Unit)? = definedExternally
    ): IPromise<U>

    fun <U> then(
        onComplete: ((value: T) -> Unit)? = definedExternally,
        onError: ((error: Any) -> IPromise<U>)? = definedExternally,
        onProgress: ((progress: Any) -> Unit)? = definedExternally
    ): IPromise<U>

    fun <U> then(
        onComplete: ((value: T) -> Unit)? = definedExternally,
        onError: ((error: Any) -> U)? = definedExternally,
        onProgress: ((progress: Any) -> Unit)? = definedExternally
    ): IPromise<U>

    fun <U> then(
        onComplete: ((value: T) -> Unit)? = definedExternally,
        onError: ((error: Any) -> Unit)? = definedExternally,
        onProgress: ((progress: Any) -> Unit)? = definedExternally
    ): IPromise<U>

    fun <U> then(): IPromise<U>
}

open external class Promise<T>(
    init: ((completeDispatch: Any, errorDispatch: Any, progressDispatch: Any) -> Unit)? = definedExternally,
    onCancel: Function<*>? = definedExternally
) : IPromise<T> {
    override fun cancel(): Unit = definedExternally
    override fun <U> done(
        onComplete: ((value: T) -> Any)?,
        onError: ((error: Any) -> Any)?,
        onProgress: ((progress: Any) -> Unit)?
    ): Unit = definedExternally

    override fun <U> then(
        onComplete: ((value: T) -> IPromise<U>)?,
        onError: ((error: Any) -> IPromise<U>)?,
        onProgress: ((progress: Any) -> Unit)?
    ): IPromise<U> = definedExternally

    override fun <U> then(
        onComplete: ((value: T) -> IPromise<U>)?,
        onError: ((error: Any) -> U)?,
        onProgress: ((progress: Any) -> Unit)?
    ): IPromise<U> = definedExternally

    override fun <U> then(
        onComplete: ((value: T) -> IPromise<U>)?,
        onError: ((error: Any) -> Unit)?,
        onProgress: ((progress: Any) -> Unit)?
    ): IPromise<U> = definedExternally

    override fun <U> then(
        onComplete: ((value: T) -> U)?,
        onError: ((error: Any) -> IPromise<U>)?,
        onProgress: ((progress: Any) -> Unit)?
    ): IPromise<U> = definedExternally

    override fun <U> then(
        onComplete: ((value: T) -> U)?,
        onError: ((error: Any) -> U)?,
        onProgress: ((progress: Any) -> Unit)?
    ): IPromise<U> = definedExternally

    override fun <U> then(
        onComplete: ((value: T) -> U)?,
        onError: ((error: Any) -> Unit)?,
        onProgress: ((progress: Any) -> Unit)?
    ): IPromise<U> = definedExternally

    override fun <U> then(
        onComplete: ((value: T) -> Unit)?,
        onError: ((error: Any) -> IPromise<U>)?,
        onProgress: ((progress: Any) -> Unit)?
    ): IPromise<U> = definedExternally

    override fun <U> then(
        onComplete: ((value: T) -> Unit)?,
        onError: ((error: Any) -> U)?,
        onProgress: ((progress: Any) -> Unit)?
    ): IPromise<U> = definedExternally

    override fun <U> then(
        onComplete: ((value: T) -> Unit)?,
        onError: ((error: Any) -> Unit)?,
        onProgress: ((progress: Any) -> Unit)?
    ): IPromise<U> = definedExternally

    companion object {
        fun onerror(eventInfo: CustomEvent): Unit = definedExternally
        fun addEventListener(
            type: String,
            listener: Function<*>,
            capture: Boolean? = definedExternally
        ): Unit = definedExternally

        fun any(value: Array<IPromise<Any>>): IPromise<Any> = definedExternally
        fun any(value: Any): IPromise<Any> = definedExternally
        fun <U> `as`(value: U? = definedExternally): IPromise<U> = definedExternally
        var cancel: IPromise<Any> = definedExternally
        fun dispatchEvent(type: String, details: Any): Boolean = definedExternally
        fun `is`(value: Any): Boolean = definedExternally
        fun join(values: Any): IPromise<Any> = definedExternally
        fun removeEventListener(
            eventType: String,
            listener: Function<*>,
            capture: Boolean? = definedExternally
        ): Unit = definedExternally

        fun then(
            promise: IPromise<Any>,
            onComplete: ((value: Any) -> Any)? = definedExternally,
            onError: ((error: Any) -> Any)? = definedExternally,
            onProgress: ((progress: Any) -> Unit)? = definedExternally
        ): IPromise<Any> = definedExternally

        fun thenEach(
            values: Any,
            complete: ((value: Any) -> Unit)? = definedExternally,
            error: ((error: Any) -> Unit)? = definedExternally,
            progress: ((progress: Any) -> Unit)? = definedExternally
        ): IPromise<Any> = definedExternally

        fun timeout(
            timeout: Number? = definedExternally,
            promise: IPromise<Any>? = definedExternally
        ): IPromise<Any> = definedExternally

        fun <U> wrap(value: U? = definedExternally): IPromise<U> = definedExternally
        fun <U> wrapError(error: U): IPromise<U> = definedExternally
        var supportedForProcessing: Boolean = definedExternally
    }

    override fun <U> then(): IPromise<U> = definedExternally
}

external fun log(
    message: String,
    tags: String? = definedExternally,
    type: String? = definedExternally
): Unit = definedExternally

external fun log(
    message: () -> String,
    tags: String? = definedExternally,
    type: String? = definedExternally
): Unit = definedExternally

external fun xhr(options: IXHROptions): Promise<XMLHttpRequest> = definedExternally
external interface IXHROptions {
    var type: String? get() = definedExternally; set(value) = definedExternally
    var url: String
    var user: String? get() = definedExternally; set(value) = definedExternally
    var password: String? get() = definedExternally; set(value) = definedExternally
    var headers: Any? get() = definedExternally; set(value) = definedExternally
    var data: Any? get() = definedExternally; set(value) = definedExternally
    var responseType: String? get() = definedExternally; set(value) = definedExternally
    var customRequestInitializer: ((request: XMLHttpRequest) -> Unit)? get() = definedExternally; set(value) = definedExternally
}
