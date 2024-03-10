import groovy.transform.Field

def info(String msg) {
    _render(colors.blue, msg)
}

def warn(String msg) {
    _render(colors.yellow, msg)

}

def error(String msg) {
    _render(colors.red, msg)

}

def _render(String fg, String msg) {
    echo "${fg}${msg}${colors.reset}"
}

@Field
Map colors = [
    reset: '\033[0m',
    blue: '\033[94;107;1m',
    yellow: '\033[93;107;1m',
    red: '\033[91;107;1m',
];


