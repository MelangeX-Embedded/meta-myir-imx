SUMMARY = "Vulkan benchmarking suite."
DESCRIPTION = "vkmark is an extensible Vulkan benchmarking suite with \
               targeted, configurable scenes."
SECTION = "graphics"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://COPYING-LGPL2.1;md5=4fbd65380cdd255951079008b364516c"

DEPENDS = "vulkan-loader assimp glm"

SRC_URI = " \
    git://github.com/vkmark/vkmark;protocol=https \
    file://0001-scenes-Use-depth-format-supported-by-i.MX.patch \
"
SRCREV = "fb591d072a841b7ffdd7ef90b0cc5ce6030455ed"
S = "${WORKDIR}/git"

inherit meson

PACKAGECONFIG ?= " \
    ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'wayland', \
       bb.utils.contains('DISTRO_FEATURES',     'x11',     'x11', \
                                                            'fb', d), d)} \
"

PACKAGECONFIG[fb] = ",,libdrm libgbm"
PACKAGECONFIG[wayland] = ",,wayland-native wayland-protocols"
PACKAGECONFIG[x11] = ",,libxcb"