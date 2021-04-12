package org.techops.cicd.jenkins.ioc

class ContextRegistry implements Serializable {
    private static IContext _context

    static void registerContext(IContext context) {
        _context = context
    }

    static void registerDefaultContext(Object steps) {
        _context =  new DefaultContext(steps)
    }
    static void registerDefaultContext(Object steps,Object env) {
        _context = new DefaultContext(steps,env)
    }

    static IContext getContext() {
        return _context
    }
}
