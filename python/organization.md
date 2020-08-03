# A Modular Approach 
* A module is a collection of variables and functions that are grouped together in a single file.
## Importing Modules
* Restoring a Module
```python
import example 
import importlib
example = importlib.reload(example) # does not work for system modules
import experiment
import imp
imp.reload(experiment)
```
## Defining Modules
* logical connection
* too small
    * has less than a handful of things
* too large
    * cannot sum up the contents and purpose of a module in a one- or two-sentence docstring
