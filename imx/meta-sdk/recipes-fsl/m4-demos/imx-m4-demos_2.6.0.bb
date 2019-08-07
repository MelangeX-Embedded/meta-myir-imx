# Copyright 2019 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

require imx-m4-demos-2.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=72c0f70181bb6e83eee6aab8de12a9f3"

SRC_URI[imx7ulp.md5sum] = "024d771b301343e3e4ab046c6a0c1760"
SRC_URI[imx7ulp.sha256sum] = "e4efb9646b66df867f618bd8121e14afe17ebadea4a405a4df951d45d841e681"

SRC_URI[imx8dxl-phantom.md5sum] = "9ae0fd33efdc4c9995db87744f7796e2"
SRC_URI[imx8dxl-phantom.sha256sum] = "5807dab795b12118e7d24a3c194421f1c06044952ba0890b9e658a797fc67d1a"

COMPATIBLE_MACHINE = "(mx7ulp|mx8dxl-phantom)"
