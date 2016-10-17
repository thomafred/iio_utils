AUTOMAKE_OPTIONS = foreign

# Process this file with 'automake' to create 'Makefile.in'

AM_CPPFLAGS = 

AM_CFLAGS = -Wall -W -Wunused -std=c99

include_HEADERS = src/lib/iio_utils.h

lib_LTLIBRARIES = libiio_utils.la
libiio_utils_la_SOURCES = src/lib/iio_utils.c

sbin_PROGRAMS = lsiio iio_event_monitor iio_generic_buffer

lsiio_SOURCES = src/lsiio.c 
lsiio_LDADD = -lm .libs/libiio_utils.la

iio_event_monitor_SOURCES = src/iio_event_monitor.c src/lib/iio_utils.c
iio_event_monitor_LDADD = -lm .libs/libiio_utils.la

iio_generic_buffer_SOURCES = src/iio_generic_buffer.c src/lib/iio_utils.c
iio_generic_buffer_LDADD = -lm .libs/libiio_utils.la

