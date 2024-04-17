DESCRIPTION = "Edge TPU  Demo Image"

inherit core-image

IMAGE_FEATURES += "ssh-server-openssh"

IMAGE_INSTALL += "\
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    ${CORE_IMAGE_BASE_INSTALL} \
    openssl-bin \
    curl \
    strace \
    gdbserver \
    "

IMAGE_INSTALL += "python3-edgetpu"
