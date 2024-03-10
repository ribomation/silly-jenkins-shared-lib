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
    reset: '\u001b[0m',
    blue: '\u001b[37m\u001b[34m',
    yellow: '\033[33m',
    red: '\033[31m',
];


