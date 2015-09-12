from pybuilder.core import use_plugin, init

use_plugin("python.core")
use_plugin("python.unittest")

default_task = "publish"

@init
def initialize(project):
    project.version = "0.1.0.SNAPSHOT"
	