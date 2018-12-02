@file:Suppress(
    "PackageName", "EnumEntryName"
)
@file:JsQualifier("Windows.ApplicationModel.Activation")

package Windows.ApplicationModel.Activation

external enum class ActivationKind {
    appointmentsProvider,
    cachedFileUpdater,
    cameraSettings,
    componentUI,
    contact,
    contactPanel,
    contactPicker,
    device,
    devicePairing,
    dialReceiver,
    file,
    fileOpenPicker,
    filePickerExperience,
    fileSavePicker,
    launch,
    lockScreen,
    lockScreenCall,
    lockScreenComponent,
    pickFileContinuation,
    pickFolderContinuation,
    pickSaveFileContinuation,
    pickerReturned,
    print3DWorkflow,
    printTaskSettings,
    protocol,
    protocolForResults,
    restrictedLaunch,
    search,
    shareTarget,
    toastNotification,
    userDataAccountsProvider,
    voiceCommand,
    walletAction,
    webAccountProvider,
    webAuthenticationBrokerContinuation,
}

external enum class ApplicationExecutionState {
    closedByUser,
    notRunning,
    running,
    suspended,
    terminated
}