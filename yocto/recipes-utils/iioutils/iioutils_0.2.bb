#
# This file was derived from the 'Hello World!' example recipe in the
# Yocto Project Development Manual.
#

DESCRIPTION = "Linux IIO-Utils Recipe"
DEPENDS = ""
LICENSE = "GPLv2"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

SRC_URI = "git://github.com/thomafred/iio_utils"

LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit autotools

# The autotools configuration I am basing this on seems to have a problem with a race condition when parallel make is enabled
PARALLEL_MAKE = ""

